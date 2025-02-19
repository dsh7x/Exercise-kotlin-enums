enum class UserRole(val accessLevel: Int){
    ADMIN(3),
    EDITOR(2),
    VIEWER(1);
}
fun checkAccess(userRole: UserRole,
                requiredLevel: Int): Boolean {
    return userRole.accessLevel >= requiredLevel
}
fun main (){
    for (role in UserRole.values()) {
        println(
            "Role: ${role.name}, " +
                    "Access Level: ${role.accessLevel}")
    }
    println("\n")

    val admin = UserRole.ADMIN
    val editor = UserRole.EDITOR
    val viewer = UserRole.VIEWER

    println("Admin can perform level 2 task: " +
            "${checkAccess(admin, 2)}")
    println("Editor can perform level 3 task: " +
            "${checkAccess(editor, 3)}")
    println("Viewer can perform level 1 task: " +
            "${checkAccess(viewer, 1)}")
}
