package main.java;

@Controler
@RequestMapping("/admin")
public class AdminController {
    @Resource(name = "studentServiceImpl")
    private StudentService studentService;
}
