package com.example.android_studio_searchbar_demo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchBarViewModel : ViewModel() {
    private val _searchedText = MutableLiveData("")
    val searchedText: LiveData<String> = _searchedText

    private val _searchHistory = MutableLiveData<List<String>>(emptyList())
    val searchHistory: LiveData<List<String>> = _searchHistory

    fun onSearchTextChange(text: String) {
        _searchedText.value = text
    }

    fun addToHistory(text: String) {
        if (text.isNotBlank()) {
            val currentHistory = _searchHistory.value.orEmpty() // Obté la llista actual o una llista buida
            _searchHistory.value = listOf(text) + currentHistory // Afegeix el nou text al principi
            _searchedText.value = "" // Neteja el text després de fer la cerca
        }
    }

    fun clearHistory() {
        _searchHistory.value = emptyList()
    }
}
