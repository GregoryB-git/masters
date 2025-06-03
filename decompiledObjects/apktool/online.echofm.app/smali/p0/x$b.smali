.class public interface abstract Lp0/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:Lp0/x$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp0/y;

    .line 2
    .line 3
    invoke-direct {v0}, Lp0/y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp0/x$b;->a:Lp0/x$b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract release()V
.end method
