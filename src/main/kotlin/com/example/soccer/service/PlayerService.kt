package com.example.soccer.service

import com.example.soccer.repository.PlayerRepository
import org.springframework.stereotype.Service
import com.example.soccer.domain.Player

@Service
class PlayerService(private val playerRepository: PlayerRepository) {
    fun findAll() = playerRepository.findAll()

    fun findOne(id: Long) = playerRepository.findById(id).orElse(null)

    fun save(player: Player) = playerRepository.save(player)

    fun delete(id: Long) = playerRepository.deleteById(id)

}