.class public interface abstract Lc1/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# static fields
.field public static final a:Lc1/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc1/t$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lc1/t$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc1/t$a;->a:Lc1/t$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a(Ld0/q;)Z
.end method

.method public abstract b(Ld0/q;)Lc1/t;
.end method

.method public abstract c(Ld0/q;)I
.end method
