int findElement(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n - 1; i++) {
        boolean leftOk = true, rightOk = true;
        
        for (int j = 0; j < i; j++) {
            if (arr[j] >= arr[i]) {
                leftOk = false;
                break;
            }
        }

        for (int j = i + 1; j < n; j++) {
            if (arr[j] <= arr[i]) {
                rightOk = false;
                break;
            }
        }

        if (leftOk && rightOk) return arr[i];
    }
    return -1;
}

int findElement(int[] arr) {
    int n = arr.length;
    int[] leftMax = new int[n];
    int[] rightMin = new int[n];

    // Build leftMax
    leftMax[0] = Integer.MIN_VALUE;
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
    }

    // Build rightMin
    rightMin[n - 1] = Integer.MAX_VALUE;
    for (int i = n - 2; i >= 0; i--) {
        rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
    }

    // Check for the required condition
    for (int i = 0; i < n; i++) {
        if (leftMax[i] < arr[i] && arr[i] < rightMin[i]) {
            return arr[i];
        }
    }

    return -1;
}
