let item_get = {
    init: function () {
        $('#cart_btn').click(function () {
            let cust_id = '${logincust.id}';
            let item_id = '${gitem.id}';
            let cnt = null;
            $.ajax({
                url: '/addcart',
                data: {cust_id: cust_id, item_id: item_id, cnt: 1},
                success: function () {
                    alert("성공")
                    //$('#myModal').modal();
                }
            });

            // $('#cart_form').attr({
            //     method: 'get',
            //     action: '/addcart'
            // });
            // $('#cart_form').submit();
        });
    }
};
$(function () {
    item_get.init();
});