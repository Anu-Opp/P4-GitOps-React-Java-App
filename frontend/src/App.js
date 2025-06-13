import React from 'react';

function App() {
  return (
    <div style={{padding: '50px', textAlign: 'center', fontFamily: 'Arial'}}>
      <h1 style={{color: '#005f73', fontSize: '48px'}}>🎉 CEEYIT GitOps Project SUCCESS!</h1>
      <h2 style={{color: '#0a9396'}}>React Frontend - GitOps Deployment</h2>
      <p style={{fontSize: '20px', color: '#264653'}}>✅ Managed by ArgoCD and deployed via Kubernetes</p>
      <p style={{fontSize: '18px', color: '#264653'}}>🚀 Built by CEEYIT DevOps Team</p>
      <div style={{marginTop: '30px', padding: '20px', backgroundColor: '#f1faee', borderRadius: '10px'}}>
        <h3>🏆 Project 4 Complete!</h3>
        <p>✅ EKS Cluster Running</p>
        <p>✅ Docker Images Deployed</p>
        <p>✅ ArgoCD GitOps Working</p>
        <p>✅ Internet Access via Load Balancer</p>
      </div>
    </div>
  );
}

export default App;
