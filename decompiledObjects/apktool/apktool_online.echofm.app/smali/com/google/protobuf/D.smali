.class public Lcom/google/protobuf/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/D$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/protobuf/D$a;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/m0$b;Ljava/lang/Object;Lcom/google/protobuf/m0$b;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/protobuf/D$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/protobuf/D$a;-><init>(Lcom/google/protobuf/m0$b;Ljava/lang/Object;Lcom/google/protobuf/m0$b;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/protobuf/D;->a:Lcom/google/protobuf/D$a;

    iput-object p2, p0, Lcom/google/protobuf/D;->b:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/protobuf/D;->c:Ljava/lang/Object;

    return-void
.end method

.method public static b(Lcom/google/protobuf/D$a;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/D$a;->a:Lcom/google/protobuf/m0$b;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/google/protobuf/o;->b(Lcom/google/protobuf/m0$b;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, Lcom/google/protobuf/D$a;->c:Lcom/google/protobuf/m0$b;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Lcom/google/protobuf/o;->b(Lcom/google/protobuf/m0$b;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static d(Lcom/google/protobuf/m0$b;Ljava/lang/Object;Lcom/google/protobuf/m0$b;Ljava/lang/Object;)Lcom/google/protobuf/D;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/D;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/protobuf/D;-><init>(Lcom/google/protobuf/m0$b;Ljava/lang/Object;Lcom/google/protobuf/m0$b;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Lcom/google/protobuf/h;Lcom/google/protobuf/D$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/protobuf/D$a;->a:Lcom/google/protobuf/m0$b;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, Lcom/google/protobuf/o;->u(Lcom/google/protobuf/h;Lcom/google/protobuf/m0$b;ILjava/lang/Object;)V

    iget-object p1, p1, Lcom/google/protobuf/D$a;->c:Lcom/google/protobuf/m0$b;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/o;->u(Lcom/google/protobuf/h;Lcom/google/protobuf/m0$b;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/h;->O(I)I

    move-result p1

    iget-object v0, p0, Lcom/google/protobuf/D;->a:Lcom/google/protobuf/D$a;

    invoke-static {v0, p2, p3}, Lcom/google/protobuf/D;->b(Lcom/google/protobuf/D$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Lcom/google/protobuf/h;->z(I)I

    move-result p2

    add-int/2addr p1, p2

    return p1
.end method

.method public c()Lcom/google/protobuf/D$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/D;->a:Lcom/google/protobuf/D$a;

    return-object v0
.end method
