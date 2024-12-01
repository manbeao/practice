import React from "react";
import { useEffect } from "react";
import './css/Map.css';
const { kakao } = window;

function Map() {
    useEffect(() => {
        const container = document.getElementById('map'); // 지도 담을 곳
        const options = {
            center: new kakao.maps.LatLng(33.45071, 126.570667),
            level: 3
        };
        // 지도 중심 부분
        const map = new kakao.maps.Map(container, options);


    const markerPosition = new kakao.maps.LatLng(33.450701, 126.570667); // 마커가 표시될 위치 
    //위도와 경도 설정으로 마커 위치 변경 가능 
    const marker = new kakao.maps.Marker({  // 마커를 생성한다
        position: markerPosition
    });

    marker.setMap(map); // 마커가 지도 위에 표시되도록 설정한다

    }, [])

    return (
        <>
            <h1>카카오 맵 API 사용</h1>
            <div id="map" style={{ width: '500px', height: '500px', borderRadius: '100px' }}>
            </div>
        </>
    )

    // 카카오맵 활성화 설정 안하면 안됨
}

// 컴포넌트를 생성하고 그 안에서 지도를 담을 영역을 설정

export default Map;