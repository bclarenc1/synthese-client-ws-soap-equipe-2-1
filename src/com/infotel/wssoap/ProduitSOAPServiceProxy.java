package com.infotel.wssoap;

public class ProduitSOAPServiceProxy implements com.infotel.wssoap.ProduitSOAPService {
  private String _endpoint = null;
  private com.infotel.wssoap.ProduitSOAPService produitSOAPService = null;
  
  public ProduitSOAPServiceProxy() {
    _initProduitSOAPServiceProxy();
  }
  
  public ProduitSOAPServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProduitSOAPServiceProxy();
  }
  
  private void _initProduitSOAPServiceProxy() {
    try {
      produitSOAPService = (new com.infotel.wssoap.ProduitSOAPServiceServiceLocator()).getProduitSOAPServicePort();
      if (produitSOAPService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)produitSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)produitSOAPService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (produitSOAPService != null)
      ((javax.xml.rpc.Stub)produitSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.infotel.wssoap.ProduitSOAPService getProduitSOAPService() {
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService;
  }
  
  public com.infotel.wssoap.Produit getProduit(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getProduit(idProduit);
  }
  
  public com.infotel.wssoap.Magasin[] getAllMagasins() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getAllMagasins();
  }
  
  public com.infotel.wssoap.Produit[] getAllProduits() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getAllProduits();
  }
  
  public void addMagasin(java.lang.String nomMagasin, int codeMagasin, double prixLocal) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.addMagasin(nomMagasin, codeMagasin, prixLocal);
  }
  
  public void removeProduit(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.removeProduit(idProduit);
  }
  
  public void editNPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.editNPerissable(idProduit, nomProduit, stock, prix, modeDemploi);
  }
  
  public void removeMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.removeMagasin(idMagasin);
  }
  
  public void addPerissable(java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.addPerissable(nomProduit, stock, prix);
  }
  
  public com.infotel.wssoap.Magasin editMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixLocal) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.editMagasin(idMagasin, nomMagasin, codeMagasin, prixLocal);
  }
  
  public void editPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.editPerissable(idProduit, nomProduit, stock, prix);
  }
  
  public void addNPerissable(java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.addNPerissable(nomProduit, stock, prix, modeDemploi);
  }
  
  public com.infotel.wssoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getMagasin(idMagasin);
  }
  
  
}