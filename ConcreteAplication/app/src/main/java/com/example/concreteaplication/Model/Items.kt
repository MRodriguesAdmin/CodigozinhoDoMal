package com.example.concreteaplication.Model

data class Items (
    var id: Int,
    var node_id: String,
    var name: String,
    var full_name: String,
    var private: Boolean,
    var owner: Owner
){
}