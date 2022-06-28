package com.jungeunhong.querydsl.member.query.domain.entity;

import com.jungeunhong.querydsl.common.entity.BaseEntity;
import com.jungeunhong.querydsl.member.command.domain.entity.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Team extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    public Team(String name){
        this.name=name;
    }

    public static Team createTeam(String team){
        return new Team(team);
    }

}
