package com.charge8.teams;

import java.util.List;

import com.charge8.user.User;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int team_id;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "teams")
    private List<User> members;


    public int getTeam_id() {
        return this.team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getMembers() {
        return this.members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }


    @Override
    public String toString() {
        return "{" +
            " team_id='" + getTeam_id() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", members='" + getMembers() + "'" +
            "}";
    }
    

}
