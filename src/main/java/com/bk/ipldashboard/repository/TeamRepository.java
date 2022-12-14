package com.bk.ipldashboard.repository;

import com.bk.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByTeamName(String teamName);
}

