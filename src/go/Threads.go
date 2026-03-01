package main

import (
	"fmt"
	"time"
)

func main() {
    // The 'go' keyword starts a goroutine
    go func() {
        fmt.Println("Hello from Goroutine!")
    }()

    // We sleep briefly because if main() exits, all goroutines die immediately
    time.Sleep(10 * time.Millisecond)
}
