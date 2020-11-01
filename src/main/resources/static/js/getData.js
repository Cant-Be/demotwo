$(function (){
                     //ajax代码                                 （?）
    $.ajax({
        url:"user/getAll",
        type:"post",
        success:function (data){
            // 取出数据库名字
            alert(data[0].username)
            // 自动调取数据库中数据
            for (var i=0; i<data.length ; i++){

                var text=
                    "<tr>\n" +
                        "<td>"+data[i].id+"</td>\n"+
                        "<td>"+data[i].username+"</td>\n"+
                        "<td>"+data[i].password+"</td>\n"+
                        "<td>"+data[i].createtime+"</td>\n"+
                        "<td>"+data[i].status+"</td>\n"+
                        "<td>\n"+
                            "<a href=\"user/delById?id="+data[i].id+" \" class=\"btn btn-danger\">删除</a>"+
                            "<a href=\"#\" class=\"btn btn-success\">修改</a>"+
                        "</td>"+
                    "</tr>"
                // 往pool里添加text代码
                var obj = $(".pool");
                obj.append(text);
            }

        }

    });

});