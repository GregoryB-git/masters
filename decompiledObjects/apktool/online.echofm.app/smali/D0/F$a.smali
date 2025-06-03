.class public interface abstract LD0/F$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# static fields
.field public static final a:LD0/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD0/F$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LD0/F$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD0/F$a;->a:LD0/F$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a(LD0/F;)V
.end method

.method public abstract b(LD0/F;)V
.end method

.method public abstract c(LD0/F;Ld0/P;)V
.end method
