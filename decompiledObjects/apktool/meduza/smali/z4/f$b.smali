.class public final Lz4/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lz4/t;

.field public final b:Lz4/t$c;

.field public final c:Lz4/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz4/f<",
            "TT;>.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz4/t;Lz4/e;Lz4/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/f$b;->a:Lz4/t;

    iput-object p2, p0, Lz4/f$b;->b:Lz4/t$c;

    iput-object p3, p0, Lz4/f$b;->c:Lz4/f$a;

    return-void
.end method
