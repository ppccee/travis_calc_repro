public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = inflate.inflate(R.layout.row_listview,null);
            viewHolder = new ViewHolder();
            viewHolder.label = (TextView) convertView.findViewById(R.id.label);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        // 리스트에 있는 데이터를 리스트뷰 셀에 뿌린다.
        viewHolder.label.setText(list.get(position));
        return convertView;
    }
