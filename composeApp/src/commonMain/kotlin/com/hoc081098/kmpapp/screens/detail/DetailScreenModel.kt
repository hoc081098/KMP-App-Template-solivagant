package com.hoc081098.kmpapp.screens.detail

import cafe.adriel.voyager.core.model.ScreenModel
import com.hoc081098.kmpapp.data.MuseumObject
import com.hoc081098.kmpapp.data.MuseumRepository
import kotlinx.coroutines.flow.Flow

class DetailScreenModel(private val museumRepository: MuseumRepository) : ScreenModel {
    fun getObject(objectId: Int): Flow<MuseumObject?> =
        museumRepository.getObjectById(objectId)
}
