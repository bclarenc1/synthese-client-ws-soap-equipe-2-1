/**
 * ProduitSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public interface ProduitSOAPService extends java.rmi.Remote {
    public com.infotel.wssoap.Produit getProduit(long idProduit) throws java.rmi.RemoteException;
    public com.infotel.wssoap.Magasin[] getAllMagasins() throws java.rmi.RemoteException;
    public com.infotel.wssoap.Produit[] getAllProduits() throws java.rmi.RemoteException;
    public void addMagasin(java.lang.String nomMagasin, int codeMagasin, double prixLocal) throws java.rmi.RemoteException;
    public void removeProduit(long idProduit) throws java.rmi.RemoteException;
    public void editNPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException;
    public void removeMagasin(long idMagasin) throws java.rmi.RemoteException;
    public void addPerissable(java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException;
    public com.infotel.wssoap.Magasin editMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixLocal) throws java.rmi.RemoteException;
    public void editPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException;
    public void addNPerissable(java.lang.String nomProduit, int stock, double prix, java.lang.String modeDemploi) throws java.rmi.RemoteException;
    public com.infotel.wssoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException;
}
