#!/bin/bash

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

DOCKER_USERNAME="anuopp"

echo -e "${YELLOW}🚀 Building and pushing Docker images for CEEYIT GitOps Project${NC}"

# Build and push backend
echo -e "${GREEN}🔨 Building backend image...${NC}"
cd backend
if docker build --platform linux/amd64 -t ${DOCKER_USERNAME}/ceeyit-backend:latest .; then
    echo -e "${GREEN}✅ Backend image built successfully${NC}"
    echo -e "${GREEN}📤 Pushing backend image...${NC}"
    if docker push ${DOCKER_USERNAME}/ceeyit-backend:latest; then
        echo -e "${GREEN}✅ Backend image pushed successfully${NC}"
    else
        echo -e "${RED}❌ Failed to push backend image - please check Docker Hub login${NC}"
        exit 1
    fi
else
    echo -e "${RED}❌ Failed to build backend image${NC}"
    exit 1
fi
cd ..

# Build and push frontend
echo -e "${GREEN}🔨 Building frontend image...${NC}"
cd frontend
if docker build --platform linux/amd64 -t ${DOCKER_USERNAME}/ceeyit-frontend:latest .; then
    echo -e "${GREEN}✅ Frontend image built successfully${NC}"
    echo -e "${GREEN}📤 Pushing frontend image...${NC}"
    if docker push ${DOCKER_USERNAME}/ceeyit-frontend:latest; then
        echo -e "${GREEN}✅ Frontend image pushed successfully${NC}"
    else
        echo -e "${RED}❌ Failed to push frontend image - please check Docker Hub login${NC}"
        exit 1
    fi
else
    echo -e "${RED}❌ Failed to build frontend image${NC}"
    exit 1
fi
cd ..

echo -e "${GREEN}🎉 All images built and pushed successfully!${NC}"
echo -e "${YELLOW}📋 Images created:${NC}"
echo "  - ${DOCKER_USERNAME}/ceeyit-backend:latest"
echo "  - ${DOCKER_USERNAME}/ceeyit-frontend:latest"
