.class public LV3/u$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/u$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/u;->b(LV3/k;LV3/u$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/k;

.field public final synthetic b:LV3/u$d;

.field public final synthetic c:LV3/u;


# direct methods
.method public constructor <init>(LV3/u;LV3/k;LV3/u$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/u$b;->c:LV3/u;

    .line 2
    .line 3
    iput-object p2, p0, LV3/u$b;->a:LV3/k;

    .line 4
    .line 5
    iput-object p3, p0, LV3/u$b;->b:LV3/u$d;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ld4/b;LV3/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/u$b;->a:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LV3/u$b;->b:LV3/u$d;

    .line 8
    .line 9
    invoke-virtual {p2, p1, v0}, LV3/u;->b(LV3/k;LV3/u$d;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
