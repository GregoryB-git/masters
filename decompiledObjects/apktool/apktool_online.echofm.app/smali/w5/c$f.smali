.class public Lw5/c$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:LE5/c$a;

.field public final b:Lw5/c$d;


# direct methods
.method public constructor <init>(LE5/c$a;Lw5/c$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw5/c$f;->a:LE5/c$a;

    .line 5
    .line 6
    iput-object p2, p0, Lw5/c$f;->b:Lw5/c$d;

    .line 7
    .line 8
    return-void
.end method
