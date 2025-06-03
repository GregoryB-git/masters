.class public final Lr5/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[Lv3/l1;

.field public final c:[Lr5/h;

.field public final d:Lv3/s1;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>([Lv3/l1;[Lr5/h;Lv3/s1;Lr5/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/p;->b:[Lv3/l1;

    invoke-virtual {p2}, [Lr5/h;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lr5/h;

    iput-object p2, p0, Lr5/p;->c:[Lr5/h;

    iput-object p3, p0, Lr5/p;->d:Lv3/s1;

    iput-object p4, p0, Lr5/p;->e:Ljava/lang/Object;

    array-length p1, p1

    iput p1, p0, Lr5/p;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lr5/p;I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lr5/p;->b:[Lv3/l1;

    aget-object v1, v1, p2

    iget-object v2, p1, Lr5/p;->b:[Lv3/l1;

    aget-object v2, v2, p2

    invoke-static {v1, v2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lr5/p;->c:[Lr5/h;

    aget-object v1, v1, p2

    iget-object p1, p1, Lr5/p;->c:[Lr5/h;

    aget-object p1, p1, p2

    invoke-static {v1, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final b(I)Z
    .locals 1

    iget-object v0, p0, Lr5/p;->b:[Lv3/l1;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
