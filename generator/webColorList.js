module.exports = (()=>{
    let list = [];
    let digits = [0x00,0x33,0x66,0x99,0xcc,0xff];
    for(let R of digits)for(let G of digits)for(let B of digits){
        list.push({R,G,B});
    }
    return list;
})()