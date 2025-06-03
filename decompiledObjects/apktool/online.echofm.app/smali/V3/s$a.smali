.class public LV3/s$a;
.super Ld4/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/s;->h(Ld4/n;LV3/E;Ljava/util/Map;)Ld4/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/E;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:LV3/t;


# direct methods
.method public constructor <init>(LV3/E;Ljava/util/Map;LV3/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/s$a;->a:LV3/E;

    .line 2
    .line 3
    iput-object p2, p0, LV3/s$a;->b:Ljava/util/Map;

    .line 4
    .line 5
    iput-object p3, p0, LV3/s$a;->c:LV3/t;

    .line 6
    .line 7
    invoke-direct {p0}, Ld4/c$c;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public b(Ld4/b;Ld4/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/s$a;->a:LV3/E;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV3/E;->a(Ld4/b;)LV3/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LV3/s$a;->b:Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {p2, v0, v1}, LV3/s;->a(Ld4/n;LV3/E;Ljava/util/Map;)Ld4/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eq v0, p2, :cond_0

    .line 14
    .line 15
    iget-object p2, p0, LV3/s$a;->c:LV3/t;

    .line 16
    .line 17
    new-instance v1, LV3/k;

    .line 18
    .line 19
    invoke-virtual {p1}, Ld4/b;->e()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v1, p1}, LV3/k;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v1, v0}, LV3/t;->c(LV3/k;Ld4/n;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
