package com.example.jocasta.ui

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jocasta.data.model.Film
import com.example.jocasta.data.model.Resource
import com.example.jocasta.data.model.ResourceResponse
import com.example.jocasta.data.repository.SwapiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val swapiRepository: SwapiRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val type: String = savedStateHandle["type"] ?: "film"
    private val id: Int = savedStateHandle["id"] ?: 1

    private val _resourceState = MutableStateFlow<ResourceFetchState>(ResourceFetchState.Fetching)
    val resourceState: StateFlow<ResourceFetchState> = _resourceState

    init {
        fetchResource(type, id)
    }

    private fun fetchResource(type: String, id: Int) {
        println("fetchResource")
        when (type) {
            "film" -> fetchFilm(id)
            "person" -> fetchPerson(id)
            "planet" -> fetchPlanet(id)
            "species" -> fetchSpecies(id)
            "starship" -> fetchStarship(id)
            "vehicle" -> fetchVehicle(id)
            else -> fetchFilm(id)
        }
    }

    private fun fetchFilm(id: Int) {
        Log.i("DetailViewModel", "#fetchFilm($id)")

        viewModelScope.launch {
            when (val response = swapiRepository.fetchFilm(id)) {
                is ResourceResponse.Success -> {
                    Log.i("DetailViewModel", "#fetchFilm response .Success")
                    _resourceState.value = ResourceFetchState.Success(resource = response.resource)
                }

                is ResourceResponse.Failure -> {
                    Log.e("DetailViewModel", "#fetchFilm response .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }

                else -> {
                    Log.e("DetailViewModel", "#fetchFilm response neither .Success nor .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }
            }
        }
    }

    private fun fetchPerson(id: Int) {
        Log.i("DetailViewModel", "#fetchPerson($id)")

        viewModelScope.launch {
            when (val response = swapiRepository.fetchPerson(id)) {
                is ResourceResponse.Success -> {
                    Log.i("DetailViewModel", "#fetchPerson response .Success")
                    _resourceState.value = ResourceFetchState.Success(resource = response.resource)
                }

                is ResourceResponse.Failure -> {
                    Log.e("DetailViewModel", "#fetchPerson response .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }

                else -> {
                    Log.e("DetailViewModel", "#fetchPerson response neither .Success nor .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }
            }
        }
    }

    private fun fetchPlanet(id: Int) {
        Log.i("DetailViewModel", "#fetchPlanet($id)")

        viewModelScope.launch {
            when (val response = swapiRepository.fetchPlanet(id)) {
                is ResourceResponse.Success -> {
                    Log.i("DetailViewModel", "#fetchPlanet response .Success")
                    _resourceState.value = ResourceFetchState.Success(resource = response.resource)
                }

                is ResourceResponse.Failure -> {
                    Log.e("DetailViewModel", "#fetchPlanet response .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }

                else -> {
                    Log.e("DetailViewModel", "#fetchPlanet response neither .Success nor .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }
            }
        }
    }

    private fun fetchSpecies(id: Int) {
        Log.i("DetailViewModel", "#fetchSpecies($id)")

        viewModelScope.launch {
            when (val response = swapiRepository.fetchSpecies(id)) {
                is ResourceResponse.Success -> {
                    Log.i("DetailViewModel", "#fetchSpecies response .Success")
                    _resourceState.value = ResourceFetchState.Success(resource = response.resource)
                }

                is ResourceResponse.Failure -> {
                    Log.e("DetailViewModel", "#fetchSpecies response .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }

                else -> {
                    Log.e("DetailViewModel", "#fetchSpecies response neither .Success nor .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }
            }
        }
    }

    private fun fetchStarship(id: Int) {
        Log.i("DetailViewModel", "#fetchStarship($id)")

        viewModelScope.launch {
            when (val response = swapiRepository.fetchStarship(id)) {
                is ResourceResponse.Success -> {
                    Log.i("DetailViewModel", "#fetchStarship response .Success")
                    _resourceState.value = ResourceFetchState.Success(resource = response.resource)
                }

                is ResourceResponse.Failure -> {
                    Log.e("DetailViewModel", "#fetchStarship response .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }

                else -> {
                    Log.e("DetailViewModel", "#fetchStarship response neither .Success nor .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }
            }
        }
    }
    private fun fetchVehicle(id: Int) {
        Log.i("DetailViewModel", "#fetchVehicle($id)")

        viewModelScope.launch {
            when (val response = swapiRepository.fetchVehicle(id)) {
                is ResourceResponse.Success -> {
                    Log.i("DetailViewModel", "##fetchVehicle response .Success")
                    _resourceState.value = ResourceFetchState.Success(resource = response.resource)
                }

                is ResourceResponse.Failure -> {
                    Log.e("DetailViewModel", "##fetchVehicle response .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }

                else -> {
                    Log.e("DetailViewModel", "##fetchVehicle response neither .Success nor .Failure")
                    _resourceState.value = ResourceFetchState.Failure
                }
            }
        }
    }
}

sealed class ResourceFetchState {

    object Fetching : ResourceFetchState()

    data class Success(
        val resource: Resource
    ) : ResourceFetchState()

    object Failure : ResourceFetchState()
}