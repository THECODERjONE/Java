while (notDone()) {
    if (isPathLeft()) {
      turnLeft();
      moveForward();
    } else {
      if (isPathForward()) {
        moveForward();
      } else {
        if (isPathRight()) {
          turnRight();
          moveForward();
        }
      }
    }
  }
  


  // 1 block to spare