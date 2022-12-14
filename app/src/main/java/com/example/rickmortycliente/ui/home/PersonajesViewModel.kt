package com.example.rickmortycliente.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmortycliente.data.api.model.Character
import com.example.rickmortycliente.data.repositorio.RickMortyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonajesViewModel @Inject constructor(
    private val rickMortyRepository: RickMortyRepository
): ViewModel(){
    private val _state = MutableStateFlow(emptyList<Character>())
    val state: StateFlow<List<Character>>
    get() = _state

    init{
        viewModelScope.launch {
            _state.value = rickMortyRepository.getCharacters().results
        }
    }
}