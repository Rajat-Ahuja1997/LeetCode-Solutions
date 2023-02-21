// https://leetcode.com/problems/intersection-of-two-arrays-ii

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    let result = [];
    const map = new Map();
    for (num of nums1) {
        if (map.has(num)) {
            map.set(num, map.get(num) + 1);
        } else {
            map.set(num, 1);
        }
    }
    for (num of nums2) {
        if (map.has(num) && map.get(num) > 0) {
            map.set(num, map.get(num) - 1);
            result.push(num);
        }
    }
    return result;
};

//map.set("a", (map.get("a"))+1);
