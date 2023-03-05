package com.example.pizzaapp.room.repository

import com.example.pizzaapp.room.CartModel
import com.example.pizzaapp.room.CartPlugin

class CartRealization : CartRepository {

    private var cartDAO = CartPlugin.database.getCartDAO
    override val allCart: List<CartModel>
        get() = cartDAO.getAllCart()

    override suspend fun addToCart(cart: CartModel) {
        cartDAO.insertInCart(cart)
    }

    override suspend fun deleteFromCart(cart: CartModel) {
        cartDAO.removeFromCart(cart)
    }

    override suspend fun deleteAllDromCart() {
        cartDAO.removeALlFromCart()
    }


}