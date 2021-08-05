package com.example.mirch_masala;

import com.example.mirch_masala.Model.AdminOrders;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.Query;

import java.security.cert.CertPathBuilder;

class FirebaseRecyclerOptions<T> {
    static class Builder<P> extends FirebaseRecyclerOptions<ProductsModel> {

        public CertPathBuilder setQuery(DatabaseReference query, Class<AdminOrders> productsModelClass) {
            return null;
        }
    }
}
