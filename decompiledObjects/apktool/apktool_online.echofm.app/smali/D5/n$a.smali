.class public LD5/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LD5/n;


# direct methods
.method public constructor <init>(LD5/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/n$a;->a:LD5/n;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
