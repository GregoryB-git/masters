.class public final Lcom/google/protobuf/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/C$b;
    }
.end annotation


# static fields
.field public static final b:Lcom/google/protobuf/J;


# instance fields
.field public final a:Lcom/google/protobuf/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/protobuf/C$a;

    invoke-direct {v0}, Lcom/google/protobuf/C$a;-><init>()V

    sput-object v0, Lcom/google/protobuf/C;->b:Lcom/google/protobuf/J;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/C;->b()Lcom/google/protobuf/J;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/C;-><init>(Lcom/google/protobuf/J;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/J;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/protobuf/t;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/J;

    iput-object p1, p0, Lcom/google/protobuf/C;->a:Lcom/google/protobuf/J;

    return-void
.end method

.method public static b()Lcom/google/protobuf/J;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/protobuf/C$b;

    invoke-static {}, Lcom/google/protobuf/q;->c()Lcom/google/protobuf/q;

    move-result-object v1

    invoke-static {}, Lcom/google/protobuf/C;->c()Lcom/google/protobuf/J;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/protobuf/J;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/google/protobuf/C$b;-><init>([Lcom/google/protobuf/J;)V

    return-object v0
.end method

.method public static c()Lcom/google/protobuf/J;
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/J;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/protobuf/C;->b:Lcom/google/protobuf/J;

    return-object v0
.end method

.method public static d(Lcom/google/protobuf/I;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/I;->b()Lcom/google/protobuf/V;

    move-result-object p0

    sget-object v0, Lcom/google/protobuf/V;->o:Lcom/google/protobuf/V;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Ljava/lang/Class;Lcom/google/protobuf/I;)Lcom/google/protobuf/Z;
    .locals 8

    .line 1
    const-class v0, Lcom/google/protobuf/r;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/protobuf/C;->d(Lcom/google/protobuf/I;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/S;->b()Lcom/google/protobuf/P;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/A;->b()Lcom/google/protobuf/A;

    move-result-object v4

    invoke-static {}, Lcom/google/protobuf/b0;->J()Lcom/google/protobuf/g0;

    move-result-object v5

    invoke-static {}, Lcom/google/protobuf/n;->b()Lcom/google/protobuf/l;

    move-result-object v6

    invoke-static {}, Lcom/google/protobuf/H;->b()Lcom/google/protobuf/F;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/N;->I(Ljava/lang/Class;Lcom/google/protobuf/I;Lcom/google/protobuf/P;Lcom/google/protobuf/A;Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/F;)Lcom/google/protobuf/N;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/S;->b()Lcom/google/protobuf/P;

    move-result-object v2

    invoke-static {}, Lcom/google/protobuf/A;->b()Lcom/google/protobuf/A;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/b0;->J()Lcom/google/protobuf/g0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/protobuf/H;->b()Lcom/google/protobuf/F;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/protobuf/N;->I(Ljava/lang/Class;Lcom/google/protobuf/I;Lcom/google/protobuf/P;Lcom/google/protobuf/A;Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/F;)Lcom/google/protobuf/N;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, Lcom/google/protobuf/C;->d(Lcom/google/protobuf/I;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/protobuf/S;->a()Lcom/google/protobuf/P;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/A;->a()Lcom/google/protobuf/A;

    move-result-object v4

    invoke-static {}, Lcom/google/protobuf/b0;->F()Lcom/google/protobuf/g0;

    move-result-object v5

    invoke-static {}, Lcom/google/protobuf/n;->a()Lcom/google/protobuf/l;

    move-result-object v6

    invoke-static {}, Lcom/google/protobuf/H;->a()Lcom/google/protobuf/F;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/N;->I(Ljava/lang/Class;Lcom/google/protobuf/I;Lcom/google/protobuf/P;Lcom/google/protobuf/A;Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/F;)Lcom/google/protobuf/N;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/protobuf/S;->a()Lcom/google/protobuf/P;

    move-result-object v2

    invoke-static {}, Lcom/google/protobuf/A;->a()Lcom/google/protobuf/A;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/b0;->G()Lcom/google/protobuf/g0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/protobuf/H;->a()Lcom/google/protobuf/F;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/protobuf/N;->I(Ljava/lang/Class;Lcom/google/protobuf/I;Lcom/google/protobuf/P;Lcom/google/protobuf/A;Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/F;)Lcom/google/protobuf/N;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/protobuf/Z;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/b0;->H(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/protobuf/C;->a:Lcom/google/protobuf/J;

    invoke-interface {v0, p1}, Lcom/google/protobuf/J;->a(Ljava/lang/Class;)Lcom/google/protobuf/I;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/I;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lcom/google/protobuf/r;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/protobuf/b0;->J()Lcom/google/protobuf/g0;

    move-result-object p1

    invoke-static {}, Lcom/google/protobuf/n;->b()Lcom/google/protobuf/l;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Lcom/google/protobuf/I;->c()Lcom/google/protobuf/K;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/O;->j(Lcom/google/protobuf/g0;Lcom/google/protobuf/l;Lcom/google/protobuf/K;)Lcom/google/protobuf/O;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/protobuf/b0;->F()Lcom/google/protobuf/g0;

    move-result-object p1

    invoke-static {}, Lcom/google/protobuf/n;->a()Lcom/google/protobuf/l;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lcom/google/protobuf/C;->e(Ljava/lang/Class;Lcom/google/protobuf/I;)Lcom/google/protobuf/Z;

    move-result-object p1

    return-object p1
.end method
