# P4-GitOps-React-Java-App

P4-GitOps-React-Java-App/
├── argocd-apps/
├── backend/
│   ├── Dockerfile
│   └── Main.java
├── frontend/
│   ├── Dockerfile
│   ├── nginx.conf
│   ├── package.json
│   ├── public/
│   │   └── index.html
│   └── src/
│       ├── App.js
│       └── index.js
├── helm-charts/
│   ├── backend-chart/
│   │   └── values.yaml
│   └── frontend-chart/
│       └── values.yaml
├── k8s-manifests/
├── terraform/
│   ├── main.tf
│   ├── outputs.tf
│   └── variables.tf
├── build-and-push.sh
└── README.md