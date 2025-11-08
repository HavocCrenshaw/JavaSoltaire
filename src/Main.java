import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Main {
    public static void main(String[] args) {
        if (!glfwInit()) {
            throw new IllegalStateException("Failed to initialize GLFW!");
        }

        long window = glfwCreateWindow(800, 600, "JavaSolitaire", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create GLFW Window!");
        }

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();
        }

        glfwTerminate();
    }
}