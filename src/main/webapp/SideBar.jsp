<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 16/11/2022
  Time: 03:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<aside class="d-flex flex-column flex-shrink-0 p-3 bg-primary vh-100 col-2">
    <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white fw-bold text-decoration-none">
        <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
        <span class="fs-6">Pole Digital Academy</span>
    </a>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto ">
        <li >
            <a href="#" class="nav-link text-white fw-bold" aria-current="page">
                <svg class="bi me-2" width="16" height="16"><use xlink:href="#home"/></svg>
                Profile
            </a>
        </li>
        <li>
            <a href="AdminServlet" class="nav-link fw-bold text-white">
                <svg class="bi me-2" width="16" height="16"><use xlink:href="#speedometer2"/></svg>
                Managers
            </a>
        </li>
        <li>
            <a href="addActivity" class="nav-link text-white fw-bold">
                <svg class="bi me-2" width="16" height="16"><use xlink:href="#table"/></svg>
                Activities
            </a>
        </li>
        <li>

            <a href="ServletParticipant" class="nav-link link-dark">

                <svg class="bi me-2" width="16" height="16"><use xlink:href="#grid"/></svg>
                Participants
            </a>
        </li>
        <li>
            <a href="#" class="nav-link text-white fw-bold">
                <svg class="bi me-2" width="16" height="16"><use xlink:href="#people-circle"/></svg>
                Exercices
            </a>
        </li>
    </ul>
    <hr>
    <div class="dropdown">
        <a href="#" class="d-flex align-items-center text-white fw-bold text-decoration-none dropdown-toggle" id="dropdownUser2" data-bs-toggle="dropdown" aria-expanded="false">
            <img src="https://github.com/mdo.png" alt="" width="32" height="32" class="rounded-circle me-2">
            <strong>mdo</strong>
        </a>
        <ul class="dropdown-menu text-small shadow" aria-labelledby="dropdownUser2">
            <li><a class="dropdown-item" href="#">New project...</a></li>
            <li><a class="dropdown-item" href="#">Settings</a></li>
            <li><a class="dropdown-item" href="#">Profile</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Sign out</a></li>
        </ul>
    </div>
</aside>

