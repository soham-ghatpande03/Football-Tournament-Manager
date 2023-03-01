package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Team;
import com.example.demo.entities.User;
import com.example.demo.repositories.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	TeamRepository terepo;
	
	public List<Team> getAll()
	{
		return terepo.findAll();
	}

	public Team saveTeam(@RequestBody Team t) {
		// TODO Auto-generated method stub
		return terepo.save(t);
	}

	
}

