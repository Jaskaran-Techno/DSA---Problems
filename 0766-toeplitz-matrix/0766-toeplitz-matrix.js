/**
 * @param {number[][]} matrix
 * @return {boolean}
 */
var isToeplitzMatrix = function(matrix) {
    for (let i = 1; i < matrix.length; i++) {
        for (let j = 0; j < matrix[0].length; j++) {
            if (matrix[i-1][j - 1] !== undefined && matrix[i][j] !== matrix[i-1][j - 1]) return false;
        }
    }
    return true;
};