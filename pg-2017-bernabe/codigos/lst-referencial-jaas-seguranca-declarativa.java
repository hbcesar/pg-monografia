@Stateless
@DeclareRoles({ "Admin" , "Alumni" , "Researcher" , "Student" , "Teacher" })
@RolesAllowed({ "Admin" })
public class ManageCourseServiceBean extends CrudServiceBean<Course> implements ManageCourseService{

...

}
