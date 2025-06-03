.class public LG5/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD5/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG5/b;-><init>(LG5/b$c;LD5/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LG5/b;


# direct methods
.method public constructor <init>(LG5/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG5/b$a;->a:LG5/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LG5/b$a;->a:LG5/b;

    .line 2
    .line 3
    invoke-static {v0}, LG5/b;->b(LG5/b;)LG5/b$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LG5/b$a;->a:LG5/b;

    .line 8
    .line 9
    invoke-static {v1, p1}, LG5/b;->a(LG5/b;Ljava/lang/String;)Landroid/view/PointerIcon;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1}, LG5/b$c;->setPointerIcon(Landroid/view/PointerIcon;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
