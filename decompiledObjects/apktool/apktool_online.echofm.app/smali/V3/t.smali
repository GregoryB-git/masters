.class public LV3/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ld4/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ld4/g;->W()Ld4/g;

    move-result-object v0

    iput-object v0, p0, LV3/t;->a:Ld4/n;

    return-void
.end method

.method public constructor <init>(Ld4/n;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV3/t;->a:Ld4/n;

    return-void
.end method


# virtual methods
.method public a(LV3/k;)Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/t;->a:Ld4/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/t;->a:Ld4/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(LV3/k;Ld4/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/t;->a:Ld4/n;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ld4/n;->y(LV3/k;Ld4/n;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, LV3/t;->a:Ld4/n;

    .line 8
    .line 9
    return-void
.end method
