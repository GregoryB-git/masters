.class public LV3/m$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->e0(LX3/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/B;

.field public final synthetic b:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;LV3/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$v;->b:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$v;->a:LV3/B;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1, p2}, LV3/m;->y(Ljava/lang/String;Ljava/lang/String;)LQ3/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, LV3/m$v;->b:LV3/m;

    .line 6
    .line 7
    iget-object v0, p0, LV3/m$v;->a:LV3/B;

    .line 8
    .line 9
    invoke-virtual {v0}, LV3/B;->c()LV3/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "Persisted write"

    .line 14
    .line 15
    invoke-static {p2, v1, v0, p1}, LV3/m;->z(LV3/m;Ljava/lang/String;LV3/k;LQ3/c;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, LV3/m$v;->b:LV3/m;

    .line 19
    .line 20
    iget-object v0, p0, LV3/m$v;->a:LV3/B;

    .line 21
    .line 22
    invoke-virtual {v0}, LV3/B;->d()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iget-object v2, p0, LV3/m$v;->a:LV3/B;

    .line 27
    .line 28
    invoke-virtual {v2}, LV3/B;->c()LV3/k;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {p2, v0, v1, v2, p1}, LV3/m;->A(LV3/m;JLV3/k;LQ3/c;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
