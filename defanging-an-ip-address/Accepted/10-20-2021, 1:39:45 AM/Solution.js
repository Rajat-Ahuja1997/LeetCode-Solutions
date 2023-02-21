// https://leetcode.com/problems/defanging-an-ip-address

/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    let newAddress = address.replaceAll('.', '[.]');
    return newAddress;
};