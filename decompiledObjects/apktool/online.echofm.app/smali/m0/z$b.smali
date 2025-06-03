.class public final Lm0/z$b;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final o:Ld0/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ld0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lm0/z$b;->o:Ld0/q;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ld0/q;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lm0/z$b;->o:Ld0/q;

    return-void
.end method
