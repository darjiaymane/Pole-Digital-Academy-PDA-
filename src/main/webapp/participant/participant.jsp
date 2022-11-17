<%@ page import="com.example.poledigitalacademypda.Entities.Participant" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: MAITITE MOHAMED
  Date: 11/16/2022
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>participant</title>
</head>
<jsp:include page="../head.jsp"></jsp:include>

<body class="d-flex bg-light">
<jsp:include page="../SideBar.jsp"></jsp:include>
<div class="col-9 p-2">
    <jsp:include page="../Navbar.jsp"></jsp:include>
    <div class="d-flex flex-column justify-content-center align-items-center p-3">
        <div class="d-flex justify-content-between w-100">
            <div class="mt-4">
                <h5 class="text-secondary ms-2 col">participant List</h5>
            </div>
            <button type="button" class="btn btn-secondary my-3" data-bs-toggle="modal" data-bs-target="#exampleModal">Add participant</button>
        </div>
        <!-- add  Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Add participant</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <form  method="post" action="addparticipant"  name="addparticipantForm"class="p-3">
                        <div class="mb-3">
                            <label for="" class="form-label">First Name</label>
                            <input type="text" name="fname" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Last Name</label>
                            <input type="text" name="lname" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="email" name="email" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">password</label>
                            <input type="password" name="password" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Phone</label>
                            <input type="text" name="phone" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Domaine</label>
                            <input type="text" name="domaine" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Role</label>
                            <select name="role" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="participant">participant</option>

                            </select>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Status</label>
                            <select name="status" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="true">Active</option>
                                <option value="false">Desactive</option>
                            </select>
                        </div>
                        <div>
                            <label class="form-label">structure</label>
                            <input type="text" name="structure" class="form-control">
                        </div>
                        <button type="submit" class="mt-2 btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
        </div>
<%--        upadate Modell--%>
        <div class="modal fade" id="updateModel" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="updateModal" >Update participant</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <form  method="post" action="updateparticipant"  name="participantForm" class="p-3">
                        <input type = "hidden" name="id">

                        <div class="mb-3">
                            <label for="" class="form-label">First Name</label>
                            <input type="text" name="fname" class="form-control" id="" aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Last Name</label>
                            <input type="text" name="lname" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="email" name="email" class="form-control"  aria-describedby="emailHelp">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Phone</label>
                            <input type="text" name="phone" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Domaine</label>
                            <input type="text" name="domaine" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Role</label>
                            <select name="role" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="participant" >participant</option>

                            </select>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Status</label>
                            <select name="status" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="true">Active</option>
                                <option value="false">Desactive</option>
                            </select>
                        </div>
                        <div>
                            <label class="form-label">structure</label>
                            <input type="text" name="structure" class="form-control">
                        </div>
                        <button type="submit" class="mt-2 btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
        </div>

        <% List<Participant> participantList = (List<Participant>) request.getAttribute("participantList");%>
        <div class="table-responsive w-100">
            <table class="table table-hover table-striped table-borderless border-top border-2 ">
                <thead>
                <tr class="rounded-3 text-table">
                    <th>Last Name</th>
                    <th>First Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Domaine</th>
                    <th>Role</th>
                    <th>status</th>
                    <th>Structure</th>
                    <th>update</th>

                </tr>
                </thead>
                <tbody>

                <% for (Participant participant : participantList){%>
                <tr class="bg-white align-middle">
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)" class="d-none"><%=participant.getId()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.getFname()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.getLname()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.getEmail()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.getPhone()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.getDomaine()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.getRole().getName()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.isStatus()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=participant.getStructure()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><i class="fa fa-pencil-square"></i></td>
                </tr>
                <%}%>

                </tbody>
            </table>
    </div>
 </div>
<script>
        function chargeModel(event) {
        let parent = event.target.parentElement;
        let form = document.forms['participantForm'];
        form.id.value = parent.children[0].innerText;
        form.fname.value = parent.children[1].innerText;
        form.lname.value = parent.children[2].innerText;
        form.email.value = parent.children[3].innerText;
        form.phone.value = parent.children[4].innerText;
        form.domaine.value = parent.children[5].innerText;
        form.role.value = parent.children[6].innerText;
        form.status.value=parent.children[7].innerText;
        form.structure.value=parent.children[8].innerText;

        }
        </script>
</body>
</html>


