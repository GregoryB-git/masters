.class public final synthetic Lv3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv3/s;->a:I

    iput p2, p0, Lv3/s;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lv3/s;->a:I

    iget v1, p0, Lv3/s;->b:I

    check-cast p1, Lv3/f1$c;

    invoke-interface {p1, v0, v1}, Lv3/f1$c;->m0(II)V

    return-void
.end method
