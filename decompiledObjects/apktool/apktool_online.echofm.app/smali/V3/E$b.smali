.class public LV3/E$b;
.super LV3/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ld4/n;


# direct methods
.method public constructor <init>(Ld4/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LV3/E;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/E$b;->a:Ld4/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ld4/b;)LV3/E;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/E$b;->a:Ld4/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, LV3/E$b;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LV3/E$b;-><init>(Ld4/n;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public b()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/E$b;->a:Ld4/n;

    .line 2
    .line 3
    return-object v0
.end method
