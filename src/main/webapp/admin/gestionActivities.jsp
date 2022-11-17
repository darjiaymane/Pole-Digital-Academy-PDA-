<%@ page import="com.example.poledigitalacademypda.Entities.Manager" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 11/15/2022
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<html>
<jsp:include page="../head.jsp"></jsp:include>

<body class="d-flex bg-light">
<jsp:include page="../SideBar.jsp"></jsp:include>
<div class="col-10 p-2">
    <jsp:include page="../Navbar.jsp"></jsp:include>
    <div class="d-flex flex-column justify-content-center align-items-center p-3">
        <div class="d-flex justify-content-between w-100">
            <div class="mt-4">
                <h5 class="text-secondary ms-2 col">Managers List</h5>
            </div>
            <button type="button" class="btn btn-secondary my-3" data-bs-toggle="modal" data-bs-target="#addModal">Add Manager</button>
        </div>
        <!-- Modal -->
        <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="updateModelLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="updateModelLabel">Add Manager</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <form  method="post" action="addManager" class="p-3" name="addManagerForm">
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
                            <label class="form-label">password</label>
                            <input type="password" name="password" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Phone</label>
                            <input type="text" name="phone" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Status</label>
                            <select name="status" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="true">Active</option>
                                <option value="false">Desactive</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Domaine</label>
                            <input type="text" name="domaine" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Role</label>
                            <select name="role" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="manager">Manager</option>
                                <option value="participant">Participant</option>
                            </select>
                        </div>
                        <div>
                            <label class="form-label">Type</label>
                            <input type="text" name="type" class="form-control">
                        </div>
                        <button type="submit" class="mt-2 btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="modal fade" id="updateModel" tabindex="-1" aria-labelledby="updateModelLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="updateModal">Update Manager</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <form  method="post" action="updateManager" class="p-3" name="managerForm">
                        <input type = "hidden" name="id">
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
                            <label class="form-label">Status</label>
                            <select name="status" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="true">Active</option>
                                <option value="false">Desactive</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Domaine</label>
                            <input type="text" name="domaine" class="form-control"  aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Role</label>
                            <select name="role" class="form-select">
                                <option selected disabled>Select option</option>
                                <option value="manager">Manager</option>
                                <option value="participant">Participant</option>
                            </select>
                        </div>
                        <div>
                            <label class="form-label">Type</label>
                            <input type="text" name="type" class="form-control">
                        </div>
                        <button type="submit" class="mt-2 btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
        </div>
        <% List< Manager> managerList = (List<Manager>) request.getAttribute("managerList");%>
        <div class="table-responsive w-100">

            <table class="table table-hover table-striped table-borderless border-top border-2 ">
                <thead>
                <tr class="rounded-3 text-table">
                    <th>Last Name</th>
                    <th>First Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Status</th>
                    <th>Domaine</th>
                    <th>Role</th>
                    <th>Type</th>
                    <th>update</th>

                </tr>
                </thead>
                <tbody>

                <% for (Manager manager : managerList){%>
                <tr class="bg-white align-middle" >
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)" class="d-none"><%=manager.getId()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.getFname()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.getLname()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.getEmail()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.getPhone()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.isStatus()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.getDomaine()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.getRole().getName()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><%=manager.getType()%></td>
                    <td data-bs-toggle="modal" data-bs-target="#updateModel" onclick="chargeModel(event)"><i class="fas fa-eye text-primary fw-light"></i></td>
                </tr>
                <%}%>

                </tbody>
            </table>
        </div>
    </div>
</div>
<script>
    function chargeModel(event) {
        let parent = event.target.parentElement;
        let form = document.forms['managerForm'];
        form.id.value = parent.children[0].innerText;
        form.fname.value = parent.children[1].innerText;
        form.lname.value = parent.children[2].innerText;
        form.email.value = parent.children[3].innerText;
        form.phone.value = parent.children[4].innerText;
        form.status.value = parent.children[5].innerText;
        form.domaine.value = parent.children[6].innerText;
        form.role.value = parent.children[7].innerText;
        form.type.value = parent.children[8].innerText;
    }
</script>
</body>
</html>
