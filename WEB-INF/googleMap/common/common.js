// Mapを作成
function createMapCanvas(mapDiv, latLng, zoom){
    // 地図を作成
    var mapCanvas = new google.maps.Map(mapDiv,{
        center: latLng,
        zoom : zoom,
        mapTypeId : google.maps.MapTypeId.ROADMAP
    });
    return mapCanvas;
}

// マーカーを作成
function createMarker(opts){
    var marker = new google.maps.Marker(opts);
    return marker;
}

// 情報ウィンドウを作成
function createInfoWindow(content,marker){
	// 情報ウィンドウを表示
	var infoWnd = new google.maps.InfoWindow({
        content : content
	});
	infoWnd.open(null, marker);
}

// 情報ウィンドウ付マーカーを作成
function createMarkerAndInfoWindow(opts, content){

    createInfoWindow(content, createMarker(opts));
}