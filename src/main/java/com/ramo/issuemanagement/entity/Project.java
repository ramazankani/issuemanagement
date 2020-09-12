package com.ramo.issuemanagement.entity;


import lombok.*;

import javax.persistence.*;

/**
 * Created by Ramazan Kani on 07.09.2020
 */

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_code", length = 300)
    private String projectCode;

    @Column(name = "project_name", length = 30)
    private String projectName;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User manager;
}
