<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <div>
        <button type="button">新增</button>
    </div>
    <thead>
        <tr>
            <th>标题</th>
            <th>内容</th>
            <th>时间</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<script src="static/js/jquery.js"></script>
    <script>
        function dateTime2str(dt, fmt) {
            var dt = new Date(dt);
            var z = {
                M : dt.getMonth() + 1,
                d : dt.getDate(),
                h : dt.getHours(),
                m : dt.getMinutes(),
                s : dt.getSeconds()
            };
            fmt = fmt.replace(/(M+|d+|h+|m+|s+)/g, function(v) {
                return ((v.length > 1 ? "0" : "") + eval('z.' + v.slice(-1)))
                .slice(-2);
            });
            return fmt.replace(/(y+)/g, function(v) {
                return dt.getFullYear().toString().slice(-v.length);
            });
        };
        $(function(){
            $.ajax({
                type: 'post',
                url:"/book/getList",
                data:{"title":"js入门到放弃"},
                dataType:'json',
                success:function(result){
                    debugger;
                    var json = result,h=[];
                    for(var i=0;i<json.length;i++){
                        h.push("<tr><td>"+json[i].title+"</td><td>"+json[i].content+"</td><td>"+dateTime2str(json[i].spantime,'yyyy-MM-dd')+"</td><td><button type=‘button’>编辑</button><button type=‘button’>删除</button></td></tr>")
                    }
                    $("tbody").html(h.join(""));
                }
            })
            $("body").on("click","button",function(){
                $.ajax({
                    type: 'post',
                    url:"/book/delList",
                    data:{"title":"js入门到放弃"},
                    dataType:'json',
                    success:function(result){
                        alert("删除成功")
                    }
                })
            })
        })
    </script>
</body>
</html>