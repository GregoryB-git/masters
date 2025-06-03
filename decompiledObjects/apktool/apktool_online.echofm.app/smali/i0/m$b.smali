.class public final Li0/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Li0/u;

.field public b:Li0/y;

.field public c:LW2/n;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0/u;

    .line 5
    .line 6
    invoke-direct {v0}, Li0/u;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li0/m$b;->a:Li0/u;

    .line 10
    .line 11
    const/16 v0, 0x1f40

    .line 12
    .line 13
    iput v0, p0, Li0/m$b;->e:I

    .line 14
    .line 15
    iput v0, p0, Li0/m$b;->f:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Li0/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/m$b;->b()Li0/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Li0/m;
    .locals 11

    .line 1
    new-instance v10, Li0/m;

    .line 2
    .line 3
    iget-object v1, p0, Li0/m$b;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Li0/m$b;->e:I

    .line 6
    .line 7
    iget v3, p0, Li0/m$b;->f:I

    .line 8
    .line 9
    iget-boolean v4, p0, Li0/m$b;->g:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Li0/m$b;->h:Z

    .line 12
    .line 13
    iget-object v6, p0, Li0/m$b;->a:Li0/u;

    .line 14
    .line 15
    iget-object v7, p0, Li0/m$b;->c:LW2/n;

    .line 16
    .line 17
    iget-boolean v8, p0, Li0/m$b;->i:Z

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    move-object v0, v10

    .line 21
    invoke-direct/range {v0 .. v9}, Li0/m;-><init>(Ljava/lang/String;IIZZLi0/u;LW2/n;ZLi0/m$a;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Li0/m$b;->b:Li0/y;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v10, v0}, Li0/b;->c(Li0/y;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object v10
.end method

.method public c(Z)Li0/m$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Li0/m$b;->g:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public d(Ljava/util/Map;)Li0/m$b;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/m$b;->a:Li0/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/u;->a(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public e(Ljava/lang/String;)Li0/m$b;
    .locals 0

    .line 1
    iput-object p1, p0, Li0/m$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
