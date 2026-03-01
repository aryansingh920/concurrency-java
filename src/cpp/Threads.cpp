#include <iostream>
#include <thread>

void threadTask() {
    std::cout << "Hello from C++ Thread!" << std::endl;
}

int main() {
    // Create and start the thread
    std::thread t1(threadTask);

    // Join ensures the main thread waits for t1
    t1.join();

    return 0;
}
